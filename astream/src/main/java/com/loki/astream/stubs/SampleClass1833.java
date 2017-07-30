package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1833 {

    @Ignore    private SampleClass1834 sampleClass;

    public SampleClass1833(){
        sampleClass = new SampleClass1834();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}