package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass542 {

    @Ignore    private SampleClass543 sampleClass;

    public SampleClass542(){
        sampleClass = new SampleClass543();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}