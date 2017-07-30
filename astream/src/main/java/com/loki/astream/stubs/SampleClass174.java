package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass174 {

    @Ignore    private SampleClass175 sampleClass;

    public SampleClass174(){
        sampleClass = new SampleClass175();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}