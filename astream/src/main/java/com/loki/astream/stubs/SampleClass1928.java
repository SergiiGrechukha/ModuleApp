package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1928 {

    @Ignore    private SampleClass1929 sampleClass;

    public SampleClass1928(){
        sampleClass = new SampleClass1929();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}