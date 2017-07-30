package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1929 {

    @Ignore    private SampleClass1930 sampleClass;

    public SampleClass1929(){
        sampleClass = new SampleClass1930();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}