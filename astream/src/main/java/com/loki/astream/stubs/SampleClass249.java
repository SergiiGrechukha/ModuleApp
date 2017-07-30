package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass249 {

    @Ignore    private SampleClass250 sampleClass;

    public SampleClass249(){
        sampleClass = new SampleClass250();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}