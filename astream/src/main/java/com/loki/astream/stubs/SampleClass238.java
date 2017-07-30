package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass238 {

    @Ignore    private SampleClass239 sampleClass;

    public SampleClass238(){
        sampleClass = new SampleClass239();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}