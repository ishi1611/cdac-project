import { configureStore, combineReducers } from "@reduxjs/toolkit";
import authSlice from './features/authSlice'

// create a new store
export const store = configureStore({
  reducer: {
    auth: authSlice,
  },
})

// import {
//   persistStore,
//   persistReducer,
//   FLUSH,
//   REHYDRATE,
//   PAUSE,
//   PERSIST,
//   PURGE,
//   REGISTER,
// } from "redux-persist";
// import storage from "redux-persist/lib/storage";


// const persistConfig = {
//   key: "root",
//   version: 1,
//   storage,
// };

// const rootReducer = combineReducers({ auth: authSlice, });

// const persistedReducer = persistReducer(persistConfig, rootReducer);

// export const store = configureStore({
//   reducer: persistedReducer,
//   middleware: (getDefaultMiddleware) =>
//     getDefaultMiddleware({
//       serializableCheck: {
//         ignoredActions: [FLUSH, REHYDRATE, PAUSE, PERSIST, PURGE, REGISTER],
//       },
//     }),
// });

// export const persistor = persistStore(store)
