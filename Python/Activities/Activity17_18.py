import pandas as pd
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}
dataframe = pandas.DataFrame(data)
dataframe.to_csv("sample.csv", index=False)

input_data = pd.read_csv("sample.csv")
print("========username  coulmn")
print (input_data["usernames"])
