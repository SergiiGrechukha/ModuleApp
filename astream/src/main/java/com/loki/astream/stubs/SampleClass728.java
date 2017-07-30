package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass728 {

    @Ignore    private SampleClass729 sampleClass;

    public SampleClass728(){
        sampleClass = new SampleClass729();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}