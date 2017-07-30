package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass317 {

    @Ignore    private SampleClass318 sampleClass;

    public SampleClass317(){
        sampleClass = new SampleClass318();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}