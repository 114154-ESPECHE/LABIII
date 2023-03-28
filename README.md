# LABIII

Para poder hacer el push tuve que hacerlo con --force.
de otra forma no me dejaba. 

errores:
-primero daba error de permisos de usuario y aparecia la cuenta vieja de git / solucion eliminar cuenta desde credenciales de windows y volver a
configurar global el nuevo usuario. No funciono actualizar ni desinstalar git reiniciando etc,.
-despues me daba estos errores (repo nueva 0km, conf globales git):
ya habia dado la ruta remote add
ya habia agregado todo con add .
ya commitee con commit -m ""
pero el push no me dejaba.

$ git push -u origin main
To https://github.com/114154-ESPECHE/LABIII.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'https://github.com/114154-ESPECHE/LABIII.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
