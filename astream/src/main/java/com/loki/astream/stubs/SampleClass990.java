package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass990 {

    @Ignore    private SampleClass991 sampleClass;

    public SampleClass990(){
        sampleClass = new SampleClass991();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}