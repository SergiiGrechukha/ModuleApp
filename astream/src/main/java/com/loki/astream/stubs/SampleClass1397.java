package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1397 {

    @Ignore    private SampleClass1398 sampleClass;

    public SampleClass1397(){
        sampleClass = new SampleClass1398();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}