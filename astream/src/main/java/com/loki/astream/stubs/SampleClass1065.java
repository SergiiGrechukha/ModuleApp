package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1065 {

    @Ignore    private SampleClass1066 sampleClass;

    public SampleClass1065(){
        sampleClass = new SampleClass1066();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}