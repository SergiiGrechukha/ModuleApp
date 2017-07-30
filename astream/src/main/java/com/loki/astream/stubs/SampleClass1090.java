package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1090 {

    @Ignore    private SampleClass1091 sampleClass;

    public SampleClass1090(){
        sampleClass = new SampleClass1091();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}