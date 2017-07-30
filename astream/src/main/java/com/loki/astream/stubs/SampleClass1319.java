package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1319 {

    @Ignore    private SampleClass1320 sampleClass;

    public SampleClass1319(){
        sampleClass = new SampleClass1320();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}