package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass784 {

    @Ignore    private SampleClass785 sampleClass;

    public SampleClass784(){
        sampleClass = new SampleClass785();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}