# -*- coding: utf-8 -*-

import os
import numpy as np  
import matplotlib.pyplot as plt
import pandas as pd
# %matplotlib inline

#Vérification de la présence du dataset
#Checking for windows OS
if not os.path.exists(os.path.join(os.path.dirname(__file__), 'dataset.csv')):
    print(str(-2))
    exit()


#lecture du dataset
data = pd.read_csv(os.path.join(os.path.dirname(__file__), 'dataset.csv'))


# Prepare data for models
y = data['Result'].values
X = data.drop(['Result'], axis = 1)

from sklearn.metrics import accuracy_score,roc_curve,auc, confusion_matrix
from sklearn import preprocessing
from sklearn.model_selection import train_test_split

# Split the data as training and testing data - 80% train size, 20% test size
X_train_80, X_test_80, y_train_80, y_test_80  = train_test_split(X, y, test_size = 0.2, random_state = None)

# creation et entrainement du modele
from sklearn.ensemble import RandomForestClassifier
import random
rfc = RandomForestClassifier()
rfc = rfc.fit(X_train_80,y_train_80)
prediction = rfc.predict([[random.randrange(-1, 2, 2) for k in range(31)]])
result = prediction[0]
print(str(result))


    
