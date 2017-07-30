package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass92 {

    @Ignore    private SampleClass93 sampleClass;

    public SampleClass92(){
        sampleClass = new SampleClass93();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}