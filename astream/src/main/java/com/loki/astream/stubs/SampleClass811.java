package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass811 {

    @Ignore    private SampleClass812 sampleClass;

    public SampleClass811(){
        sampleClass = new SampleClass812();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}