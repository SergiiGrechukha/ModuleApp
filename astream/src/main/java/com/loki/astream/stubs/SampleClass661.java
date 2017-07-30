package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass661 {

    @Ignore    private SampleClass662 sampleClass;

    public SampleClass661(){
        sampleClass = new SampleClass662();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}