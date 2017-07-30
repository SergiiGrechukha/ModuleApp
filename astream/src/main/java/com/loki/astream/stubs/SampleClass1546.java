package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1546 {

    @Ignore    private SampleClass1547 sampleClass;

    public SampleClass1546(){
        sampleClass = new SampleClass1547();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}