package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass617 {

    @Ignore    private SampleClass618 sampleClass;

    public SampleClass617(){
        sampleClass = new SampleClass618();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}