package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1114 {

    @Ignore    private SampleClass1115 sampleClass;

    public SampleClass1114(){
        sampleClass = new SampleClass1115();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}