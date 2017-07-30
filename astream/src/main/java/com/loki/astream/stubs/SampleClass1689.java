package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1689 {

    @Ignore    private SampleClass1690 sampleClass;

    public SampleClass1689(){
        sampleClass = new SampleClass1690();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}