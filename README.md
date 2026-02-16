# ⚔️ Lifesteal - Ultimate Hardcore PvP Plugin (1.21)

![Version](https://img.shields.io/badge/Version-2.1-brightgreen) ![API](https://img.shields.io/badge/Spigot-1.21-orange) ![License](https://img.shields.io/badge/License-MIT-blue)

**Lifesteal** is a lightweight, feature-rich **Minecraft Spigot plugin** that adds a hardcore twist to your **SMP (Survival Multiplayer)** server. When you kill a player, you steal a heart from them. If a player loses all their hearts, they are **eliminated (banned)**.

This plugin is designed for **Minecraft 1.21** and offers full customization, including custom items, **PlaceholderAPI support**, and unique features like the **Doomsday Sword**.

---

## 🔥 Key Features

* **Heart Stealing System**: Gain a heart upon killing another player; lose a heart upon death.
* **Hardcore Elimination**: Players reaching 0 hearts are automatically banned (eliminated) with a custom message.
* **Heart Items**: Craft or spawn **Hearts** (Nether Star) to consume and regain lost health.
* **Doomsday Sword**: A legendary admin weapon that **instantly eliminates** players and consumes their soul (bans them permanently on hit).
* **Revive System**: Admins can revive eliminated players and restore their hearts.
* **Fully Customizable**: Configure max hearts, starting hearts, and messages with **Hex Colors & Gradients** support.
* **PlaceholderAPI Hook**: Display hearts and status in scoreboards and tablists.

---

## 🛠️ Installation

1.  Download the `Lifesteal-2.1.jar`.
2.  Place the file into your server's `plugins` folder.
3.  Restart your server.
4.  (Optional) Edit `config.yml` and `messages.yml` to customize the experience.

---

## 💻 Commands & Permissions

Manage your Lifesteal SMP easily with the following commands.

| Command | Description | Permission |
| :--- | :--- | :--- |
| `/lifesteal help` | Displays the help menu. | None |
| `/lifesteal get <player>` | Check the exact heart amount of a player. | None |
| `/lifesteal set <player> <amount>` | Set a specific amount of hearts for a player. | `lifesteal.admin` |
| `/lifesteal eliminate <player>` | Forcefully eliminate (ban) a player. | `lifesteal.admin` |
| `/lifesteal revive <player>` | Revive an eliminated player and reset their hearts. | `lifesteal.admin` |
| `/lifesteal doomsday` | Spawn the **Blade of Eternal Damnation** (Doomsday Sword). | `lifesteal.admin` |
| `/lifesteal reload` | Reloads the configuration and messages. | `lifesteal.reload` |

**Default Admin Permission:** `lifesteal.admin` (defaults to OP).

---

## 📊 Placeholders (PlaceholderAPI)

Lifesteal natively supports **PlaceholderAPI**. Use these placeholders in your scoreboard, chat, or tablist.

* `%lifesteal_hearts%` - Current hearts.
* `%lifesteal_maxhearts%` - Maximum possible hearts.
* `%lifesteal_hearts_bar%` - Visual representation (e.g., ❤❤❤❤❤).
* `%lifesteal_status%` - Status (Alive/Eliminated).
* `%lifesteal_banned%` - Ban status (true/false).
* `%lifesteal_health%` - Current HP.

---

## ⚙️ Configuration

The `config.yml` is simple and effective:

```yaml
# Maximum amount of hearts a player can have
max-hearts: 20

# Hearts given to players when they join for the first time
starting-hearts: 10

# Should players lose a heart if they die from fall damage?
lose-hearts-from-fall: false
