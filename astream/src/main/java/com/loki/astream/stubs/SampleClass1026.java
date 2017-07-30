package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1026 {

    @Ignore    private SampleClass1027 sampleClass;

    public SampleClass1026(){
        sampleClass = new SampleClass1027();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}