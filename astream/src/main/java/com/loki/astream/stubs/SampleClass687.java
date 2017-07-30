package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass687 {

    @Ignore    private SampleClass688 sampleClass;

    public SampleClass687(){
        sampleClass = new SampleClass688();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}