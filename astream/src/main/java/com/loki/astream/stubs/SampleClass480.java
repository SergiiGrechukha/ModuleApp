package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass480 {

    @Ignore    private SampleClass481 sampleClass;

    public SampleClass480(){
        sampleClass = new SampleClass481();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}