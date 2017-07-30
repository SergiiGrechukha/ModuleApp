package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass241 {

    @Ignore    private SampleClass242 sampleClass;

    public SampleClass241(){
        sampleClass = new SampleClass242();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}