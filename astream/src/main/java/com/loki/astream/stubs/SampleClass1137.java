package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1137 {

    @Ignore    private SampleClass1138 sampleClass;

    public SampleClass1137(){
        sampleClass = new SampleClass1138();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}