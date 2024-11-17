import React from 'react';
import AccountSummary from '../components/dashboard/AccountSummary';
import TransactionHistory from '../components/dashboard/TransactionHistory';
import QuickTransfer from '../components/dashboard/QuickTransfer';
import BalanceCard from '../components/dashboard/BalanceCard';

const Dashboard = () =>
{
    return (
        <div className="min-h-screen bg-gray-100 p-6">
            <div className="max-w-6xl mx-auto">
                <h1 className="text-2xl font-bold text-gray-800 mb-6">Dashboard</h1>

                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                    <BalanceCard />
                    <QuickTransfer />
                    <AccountSummary />
                </div>

                <div className="mt-6">
                    <TransactionHistory />
                </div>
            </div>
        </div>
    );
};

export default Dashboard;