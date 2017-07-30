package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1806 {

    @Ignore    private SampleClass1807 sampleClass;

    public SampleClass1806(){
        sampleClass = new SampleClass1807();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}