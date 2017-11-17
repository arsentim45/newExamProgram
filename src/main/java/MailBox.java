import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static jdk.nashorn.internal.objects.NativeMap.size;

public class MailBox {
    public MailBox(List infos){
        this.infos.add(infos);
    }

    public List infos = new List() {
        public int size() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public boolean contains(Object o) {
            return false;
        }

        public Iterator iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        public boolean add(Object o) {
            return false;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection c) {
            return false;
        }

        public boolean addAll(Collection c) {
            return false;
        }

        public boolean addAll(int index, Collection c) {
            return false;
        }

        public boolean removeAll(Collection c) {
            return false;
        }

        public boolean retainAll(Collection c) {
            return false;
        }

        public void clear() {

        }

        public Object get(int index) {
            return null;
        }

        public Object set(int index, Object element) {
            return null;
        }

        public void add(int index, Object element) {

        }

        public Object remove(int index) {
            return null;
        }

        public int indexOf(Object o) {
            return 0;
        }

        public int lastIndexOf(Object o) {
            return 0;
        }

        public ListIterator listIterator() {
            return null;
        }

        public ListIterator listIterator(int index) {
            return null;
        }

        public List subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }


    public void sendAll(MailSender senders, MailInfo Info){
        //for(int i = 0, i < size(infos), i++){
        senders.sendMail(Info);
        //}
    }
}
