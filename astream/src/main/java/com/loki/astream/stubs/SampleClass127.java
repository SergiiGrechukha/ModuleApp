package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass127 {

    @Ignore    private SampleClass128 sampleClass;

    public SampleClass127(){
        sampleClass = new SampleClass128();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}