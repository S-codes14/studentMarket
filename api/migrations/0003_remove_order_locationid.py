# Generated by Django 3.2.6 on 2021-08-08 12:06

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('api', '0002_auto_20210808_1302'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='order',
            name='locationID',
        ),
    ]