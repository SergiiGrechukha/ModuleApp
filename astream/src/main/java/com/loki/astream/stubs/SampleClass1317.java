package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1317 {

    @Ignore    private SampleClass1318 sampleClass;

    public SampleClass1317(){
        sampleClass = new SampleClass1318();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}