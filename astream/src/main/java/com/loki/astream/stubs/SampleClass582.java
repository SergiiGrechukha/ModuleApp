package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass582 {

    @Ignore    private SampleClass583 sampleClass;

    public SampleClass582(){
        sampleClass = new SampleClass583();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}