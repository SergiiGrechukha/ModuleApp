package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1631 {

    @Ignore    private SampleClass1632 sampleClass;

    public SampleClass1631(){
        sampleClass = new SampleClass1632();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}