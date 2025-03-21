# 🚀 URL Shortener (Android)

**URL Shortener** — это Android-приложение, которое позволяет создавать и управлять сокращёнными ссылками. Данные не сохраняются и очищаются при каждом запуске.

## 📱 Функции
- **Добавление ссылок** с проверкой корректности.
- **Предотвращение дублирования** длинных и коротких ссылок.
- **Кастомный дизайн ListView** с цветными кликабельными ссылками.
- **Открытие ссылок в браузере** при нажатии.
- **Кастомный дизайн UI**: темный фон, красная кнопка, минималистичный стиль.

## 🔧 Технологии
- **Язык:** Kotlin
- **UI:** XML (Android Layouts)
- **Адаптер для ListView**
- **Intent для перехода по ссылке**

## 📂 Структура проекта
```
📂 app/src/main/java/com/example/urlshortener/
├── MainActivity.kt          # Основная логика приложения
├── ShortLink.kt             # Модель данных
├── ShortLinkAdapter.kt      # Адаптер для ListView

📂 res/layout/
├── activity_main.xml        # Главный экран
├── list_item.xml            # Элемент ListView
```

## 🚀 Как запустить проект
### 1️⃣ Склонировать репозиторий:
```sh
git clone https://github.com/your-username/url-shortener-android.git
cd url-shortener-android
```

### 2️⃣ Открыть в Android Studio:
- **File** → **Open** → Выбрать папку с проектом
- Дождаться завершения синхронизации

### 3️⃣ Запустить приложение:
- Подключить эмулятор или физическое устройство
- Нажать ▶ (Run) в Android Studio

## 📜 Лицензия
Этот проект распространяется под лицензией MIT. 🚀
