package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass980 {

    @Ignore    private SampleClass981 sampleClass;

    public SampleClass980(){
        sampleClass = new SampleClass981();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}