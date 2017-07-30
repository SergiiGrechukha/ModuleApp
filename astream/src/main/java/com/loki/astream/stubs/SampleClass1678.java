package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1678 {

    @Ignore    private SampleClass1679 sampleClass;

    public SampleClass1678(){
        sampleClass = new SampleClass1679();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}