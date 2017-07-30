package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1036 {

    @Ignore    private SampleClass1037 sampleClass;

    public SampleClass1036(){
        sampleClass = new SampleClass1037();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}