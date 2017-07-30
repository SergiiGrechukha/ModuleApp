package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass778 {

    @Ignore    private SampleClass779 sampleClass;

    public SampleClass778(){
        sampleClass = new SampleClass779();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}