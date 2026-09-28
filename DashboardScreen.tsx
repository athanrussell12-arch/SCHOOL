// DashboardScreen.tsx
import React from 'react';
import {
  Platform,
  Pressable,
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  View,
} from 'react-native';
import { colors, radius, spacing } from './theme';

type QuickAction = {
  id: string;
  label: string;
  glyph: string;
};

type DayBar = {
  id: string;
  label: string;
  value: number;
};

type Transaction = {
  id: string;
  title: string;
  meta: string;
  amount: number;
  initial: string;
  tint: string;
};

const QUICK_ACTIONS: QuickAction[] = [
  { id: 'send', label: 'Send', glyph: '↑' },
  { id: 'request', label: 'Request', glyph: '↓' },
  { id: 'topup', label: 'Top up', glyph: '+' },
  { id: 'more', label: 'More', glyph: '⋯' },
];

const WEEK: DayBar[] = [
  { id: 'mon', label: 'M', value: 38 },
  { id: 'tue', label: 'T', value: 62 },
  { id: 'wed', label: 'W', value: 30 },
  { id: 'thu', label: 'T', value: 74 },
  { id: 'fri', label: 'F', value: 92 },
  { id: 'sat', label: 'S', value: 48 },
  { id: 'sun', label: 'S', value: 58 },
];

const TODAY_INDEX = 4;

const TRANSACTIONS: Transaction[] = [
  {
    id: 'tx-1',
    title: 'Spotify',
    meta: 'Subscription · Today, 09:41',
    amount: -9.99,
    initial: 'S',
    tint: '#1DB954',
  },
  {
    id: 'tx-2',
    title: 'Blue Bottle Coffee',
    meta: 'Food & Drink · Today, 08:12',
    amount: -6.4,
    initial: 'B',
    tint: '#E8A33D',
  },
  {
    id: 'tx-3',
    title: 'Payroll Deposit',
    meta: 'Income · Yesterday',
    amount: 3240,
    initial: 'P',
    tint: colors.positive,
  },
  {
    id: 'tx-4',
    title: 'Uber',
    meta: 'Transport · Yesterday',
    amount: -18.2,
    initial: 'U',
    tint: '#4C9AFF',
  },
];

const formatAmount = (value: number) => {
  const sign = value > 0 ? '+' : '−';
  return `${sign}$${Math.abs(value)
    .toFixed(2)
    .replace(/\B(?=(\d{3})+(?!\d))/g, ',')}`;
};

export default function DashboardScreen() {
  return (
    <SafeAreaView style={styles.safe}>
      <StatusBar barStyle="light-content" backgroundColor={colors.bg} />

      <ScrollView
        contentContainerStyle={styles.content}
        showsVerticalScrollIndicator={false}
      >
        {/* ---------- Header ---------- */}
        <View style={styles.header}>
          <View>
            <Text style={styles.greeting}>Good morning</Text>
            <Text style={styles.name}>Alex Morgan</Text>
          </View>
          <Pressable style={styles.avatar}>
            <Text style={styles.avatarText}>AM</Text>
          </Pressable>
        </View>

        {/* ---------- Balance card ---------- */}
        <View style={styles.balanceCard}>
          <View style={styles.blobPrimary} />
          <View style={styles.blobSecondary} />

          <Text style={styles.balanceLabel}>TOTAL BALANCE</Text>
          <Text style={styles.balanceAmount}>$12,480.55</Text>

          <View style={styles.balanceMeta}>
            <View style={styles.metaItem}>
              <View style={[styles.metaDot, { backgroundColor: colors.positive }]} />
              <View>
                <Text style={styles.metaLabel}>Income</Text>
                <Text style={styles.metaValue}>$3,240.00</Text>
              </View>
            </View>

            <View style={styles.metaDivider} />

            <View style={styles.metaItem}>
              <View style={[styles.metaDot, { backgroundColor: colors.negative }]} />
              <View>
                <Text style={styles.metaLabel}>Expenses</Text>
                <Text style={styles.metaValue}>$1,184.20</Text>
              </View>
            </View>
          </View>
        </View>

        {/* ---------- Quick actions ---------- */}
        <View style={styles.actions}>
          {QUICK_ACTIONS.map((action) => (
            <Pressable key={action.id} style={styles.actionItem}>
              <View style={styles.actionButton}>
                <Text style={styles.actionGlyph}>{action.glyph}</Text>
              </View>
              <Text style={styles.actionLabel}>{action.label}</Text>
            </Pressable>
          ))}
        </View>

        {/* ---------- Spending ---------- */}
        <View style={styles.sectionHeader}>
          <Text style={styles.sectionTitle}>Spending</Text>
          <Text style={styles.sectionAction}>This week</Text>
        </View>

        <View style={styles.chartCard}>
          <View style={styles.chartTop}>
            <View>
              <Text style={styles.chartValue}>$428.60</Text>
              <Text style={styles.chartCaption}>spent this week</Text>
            </View>
            <View style={styles.trendPill}>
              <Text style={styles.trendText}>↓ 12% vs last week</Text>
            </View>
          </View>

          <View style={styles.chartRow}>
            {WEEK.map((day, index) => {
              const isToday = index === TODAY_INDEX;
              return (
                <View key={day.id} style={styles.barColumn}>
                  <View
                    style={[
                      styles.bar,
                      { height: day.value },
                      isToday && styles.barActive,
                    ]}
                  />
                  <Text
                    style={[styles.barLabel, isToday && styles.barLabelActive]}
                  >
                    {day.label}
                  </Text>
                </View>
              );
            })}
          </View>
        </View>

        {/* ---------- Recent activity ---------- */}
        <View style={styles.sectionHeader}>
          <Text style={styles.sectionTitle}>Recent activity</Text>
          <Text style={styles.sectionAction}>See all</Text>
        </View>

        <View style={styles.list}>
          {TRANSACTIONS.map((tx, index) => (
            <View
              key={tx.id}
              style={[styles.txRow, index > 0 && styles.txRowBorder]}
            >
              <View style={[styles.txIcon, { backgroundColor: `${tx.tint}22` }]}>
                <Text style={[styles.txInitial, { color: tx.tint }]}>
                  {tx.initial}
                </Text>
              </View>

              <View style={styles.txBody}>
                <Text style={styles.txTitle}>{tx.title}</Text>
                <Text style={styles.txMeta}>{tx.meta}</Text>
              </View>

              <Text
                style={[
                  styles.txAmount,
                  { color: tx.amount > 0 ? colors.positive : colors.text },
                ]}
              >
                {formatAmount(tx.amount)}
              </Text>
            </View>
          ))}
        </View>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: {
    flex: 1,
    backgroundColor: colors.bg,
    paddingTop: Platform.OS === 'android' ? StatusBar.currentHeight ?? 0 : 0,
  },
  content: {
    paddingHorizontal: spacing.xl,
    paddingTop: spacing.lg,
    paddingBottom: spacing.xxl,
  },

  /* Header */
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    marginBottom: spacing.xl,
  },
  greeting: {
    fontSize: 13,
    color: colors.textMuted,
    letterSpacing: 0.3,
    marginBottom: 2,
  },
  name: {
    fontSize: 22,
    fontWeight: '700',
    color: colors.text,
    letterSpacing: -0.3,
  },
  avatar: {
    width: 46,
    height: 46,
    borderRadius: 23,
    backgroundColor: colors.surfaceAlt,
    alignItems: 'center',
    justifyContent: 'center',
    borderWidth: 1,
    borderColor: colors.border,
  },
  avatarText: {
    fontSize: 14,
    fontWeight: '700',
    color: colors.text,
    letterSpacing: 0.5,
  },

  /* Balance card */
  balanceCard: {
    backgroundColor: colors.surface,
    borderRadius: radius.lg,
    borderWidth: 1,
    borderColor: colors.border,
    padding: spacing.xl,
    overflow: 'hidden',
    marginBottom: spacing.xl,
  },
  blobPrimary: {
    position: 'absolute',
    width: 220,
    height: 220,
    borderRadius: 110,
    backgroundColor: colors.accent,
    opacity: 0.35,
    top: -110,
    right: -70,
  },
  blobSecondary: {
    position: 'absolute',
    width: 160,
    height: 160,
    borderRadius: 80,
    backgroundColor: colors.cyan,
    opacity: 0.12,
    bottom: -90,
    left: -50,
  },
  balanceLabel: {
    fontSize: 11,
    fontWeight: '600',
    letterSpacing: 1.6,
    color: colors.textMuted,
    marginBottom: spacing.sm,
  },
  balanceAmount: {
    fontSize: 38,
    fontWeight: '700',
    letterSpacing: -1,
    color: colors.white,
    marginBottom: spacing.xl,
  },
  balanceMeta: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: 'rgba(255,255,255,0.05)',
    borderRadius: radius.md,
    paddingVertical: spacing.md,
    paddingHorizontal: spacing.lg,
  },
  metaItem: {
    flex: 1,
    flexDirection: 'row',
    alignItems: 'center',
    gap: spacing.sm,
  },
  metaDot: {
    width: 8,
    height: 8,
    borderRadius: 4,
  },
  metaLabel: {
    fontSize: 11,
    color: colors.textMuted,
    marginBottom: 2,
  },
  metaValue: {
    fontSize: 14,
    fontWeight: '600',
    color: colors.text,
  },
  metaDivider: {
    width: 1,
    height: 28,
    backgroundColor: colors.border,
    marginHorizontal: spacing.md,
  },

  /* Quick actions */
  actions: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: spacing.xl,
  },
  actionItem: {
    flex: 1,
    alignItems: 'center',
    gap: spacing.sm,
  },
  actionButton: {
    width: 58,
    height: 58,
    borderRadius: 20,
    backgroundColor: colors.surface,
    borderWidth: 1,
    borderColor: colors.border,
    alignItems: 'center',
    justifyContent: 'center',
  },
  actionGlyph: {
    fontSize: 20,
    fontWeight: '600',
    color: colors.text,
  },
  actionLabel: {
    fontSize: 12,
    color: colors.textMuted,
  },

  /* Section headers */
  sectionHeader: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    marginBottom: spacing.md,
  },
  sectionTitle: {
    fontSize: 16,
    fontWeight: '700',
    color: colors.text,
    letterSpacing: -0.2,
  },
  sectionAction: {
    fontSize: 13,
    color: colors.textMuted,
  },

  /* Chart */
  chartCard: {
    backgroundColor: colors.surface,
    borderRadius: radius.lg,
    borderWidth: 1,
    borderColor: colors.border,
    padding: spacing.lg,
    marginBottom: spacing.xl,
  },
  chartTop: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    marginBottom: spacing.lg,
  },
  chartValue: {
    fontSize: 24,
    fontWeight: '700',
    color: colors.text,
    letterSpacing: -0.5,
  },
  chartCaption: {
    fontSize: 12,
    color: colors.textMuted,
    marginTop: 2,
  },
  trendPill: {
    backgroundColor: 'rgba(61,220,151,0.12)',
    paddingHorizontal: spacing.md,
    paddingVertical: 6,
    borderRadius: radius.pill,
  },
  trendText: {
    fontSize: 12,
    fontWeight: '600',
    color: colors.positive,
  },
  chartRow: {
    flexDirection: 'row',
    alignItems: 'flex-end',
    justifyContent: 'space-between',
  },
  barColumn: {
    flex: 1,
    alignItems: 'center',
    gap: spacing.sm,
  },
  bar: {
    width: 10,
    borderRadius: 5,
    backgroundColor: colors.accentSoft,
  },
  barActive: {
    backgroundColor: colors.accent,
  },
  barLabel: {
    fontSize: 11,
    fontWeight: '500',
    color: colors.textFaint,
  },
  barLabelActive: {
    fontWeight: '700',
    color: colors.text,
  },

  /* Transactions */
  list: {
    backgroundColor: colors.surface,
    borderRadius: radius.lg,
    borderWidth: 1,
    borderColor: colors.border,
    paddingHorizontal: spacing.lg,
    paddingVertical: spacing.sm,
  },
  txRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: spacing.md,
    paddingVertical: spacing.md,
  },
  txRowBorder: {
    borderTopWidth: 1,
    borderTopColor: colors.border,
  },
  txIcon: {
    width: 44,
    height: 44,
    borderRadius: 14,
    alignItems: 'center',
    justifyContent: 'center',
  },
  txInitial: {
    fontSize: 16,
    fontWeight: '700',
  },
  txBody: {
    flex: 1,
  },
  txTitle: {
    fontSize: 15,
    fontWeight: '600',
    color: colors.text,
    marginBottom: 2,
  },
  txMeta: {
    fontSize: 12,
    color: colors.textMuted,
  },
  txAmount: {
    fontSize: 15,
    fontWeight: '700',
  },
});