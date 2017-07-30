package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass386 {

    @Ignore    private SampleClass387 sampleClass;

    public SampleClass386(){
        sampleClass = new SampleClass387();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}