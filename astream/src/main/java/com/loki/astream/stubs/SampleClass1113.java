package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1113 {

    @Ignore    private SampleClass1114 sampleClass;

    public SampleClass1113(){
        sampleClass = new SampleClass1114();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}