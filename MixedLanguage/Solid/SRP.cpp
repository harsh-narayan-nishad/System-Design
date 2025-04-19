#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Invoice {
private:
    vector<string> invoices;

public:
    void AddInvoice(const string& invoiceDetails) {
        invoices.push_back(invoiceDetails);
        cout << "Invoice added: \"" << invoiceDetails << "\"" << endl;
    }

    void DeleteInvoice(const string& invoiceDetails) {
        auto it = find(invoices.begin(), invoices.end(), invoiceDetails);
        if (it != invoices.end()) {
            invoices.erase(it);
            cout << "Invoice deleted: \"" << invoiceDetails << "\"" << endl;
        } else {
            cout << "Invoice not found: \"" << invoiceDetails << "\"" << endl;
        }
    }

    void ListInvoices() const {
        cout << "\nCurrent Invoices:\n-----------------" << endl;
        if (invoices.empty()) {
            cout << "No invoices available." << endl;
        } else {
            for (const auto& invoice : invoices) {
                cout << "- " << invoice << endl;
            }
        }
        cout << endl;
    }

    const vector<string>& GetInvoices() const {
        return invoices;
    }
};

class Report {
public:
    string GenerateReport(const vector<string>& invoices) const {
        if (invoices.empty()) {
            return "There are no invoices to include in the report.";
        }

        string report = "Invoice Report\n===============\n";
        for (const auto& invoice : invoices) {
            report += "- " + invoice + "\n";
        }
        return report;
    }
};

class Email {
public:
    void EmailReport(const string& report, const string& recipientEmail) const {
        cout << "\nSending report to: " << recipientEmail << "\n" << endl;
        cout << report << endl;
        cout << "\nReport sent successfully to " << recipientEmail << "." << endl;
    }
};

int main() {
    cout << "Welcome to the Invoice Manager\n" << endl;

    Invoice invoiceManager;
    invoiceManager.AddInvoice("Invoice #001 - $500 for Website Design");
    invoiceManager.AddInvoice("Invoice #002 - $750 for Video Editing");
    invoiceManager.ListInvoices();

    Report reportGenerator;
    string report = reportGenerator.GenerateReport(invoiceManager.GetInvoices());

    Email emailSender;
    emailSender.EmailReport(report, "client@example.com");

    cout << "\nAll tasks completed. Have a great day!" << endl;
    return 0;
}
