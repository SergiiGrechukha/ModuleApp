package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass662 {

    @Ignore    private SampleClass663 sampleClass;

    public SampleClass662(){
        sampleClass = new SampleClass663();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}