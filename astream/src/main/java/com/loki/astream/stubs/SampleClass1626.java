package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1626 {

    @Ignore    private SampleClass1627 sampleClass;

    public SampleClass1626(){
        sampleClass = new SampleClass1627();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}