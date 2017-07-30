package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass678 {

    @Ignore    private SampleClass679 sampleClass;

    public SampleClass678(){
        sampleClass = new SampleClass679();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}