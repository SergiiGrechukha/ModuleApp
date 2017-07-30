package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass739 {

    @Ignore    private SampleClass740 sampleClass;

    public SampleClass739(){
        sampleClass = new SampleClass740();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}