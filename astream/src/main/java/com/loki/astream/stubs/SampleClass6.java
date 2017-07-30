package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass6 {

    @Ignore    private SampleClass7 sampleClass;

    public SampleClass6(){
        sampleClass = new SampleClass7();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}